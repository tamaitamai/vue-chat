<template>
    <div class="user-main">
        <div class="user-box">
            <div class="user-title">新規登録</div>
            <div class="error">{{ errorMap['mail'] }}</div>
            <input type="text" id="mail" name="mail" v-model="mail" placeholder="メール">
            <div class="error">{{ errorMap['lastName'] }}</div>
            <input type="text" id="lastName" name="lastName" v-model="lastName" placeholder="名字">
            <div class="error">{{ errorMap['firstName'] }}</div>
            <input type="text" id="firstName" name="firstName" v-model="firstName" placeholder="名前">
            <div class="error">{{ errorMap['password'] }}</div>
            <input type="password" id="password" name="password" v-model="password" placeholder="パスワード">
            <button class="btn" @click="userInsert()">登録</button>
        </div>
        <RouterLink to="/login" class="move-url">ログイン画面へ</RouterLink>
    </div>
</template>
<script setup>
import { eroorView } from '@/utils';
import axios from 'axios';
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter()
const mail = ref('');
const lastName = ref('');
const firstName = ref('');
const password = ref('');

const errorMap = ref({
    'mail': '',
    'lastName': '',
    'firstName': '',
    'password': '',
})

function userInsert(){
    axios.post('/user/insert',
        {
            mail: mail.value,
            lastName: lastName.value,
            firstName: firstName.value,
            password: password.value
        }
    ).then(() => {
        router.push({path: '/member'})
    })
    .catch(error => {
        eroorView(error, errorMap.value)
    })
    
}
</script>
<style src="../../css/user/user.css" scoped></style>