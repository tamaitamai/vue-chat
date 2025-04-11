<template>
    <div class="user-main">
        <div class="user-box">
            <div class="user-title">新規登録</div>
            <input type="text" id="mail" name="mail" v-model="mail" placeholder="メール">
            <div class="error">{{ errorMap['mail'] }}</div>
            <input type="password" id="password" name="password" v-model="password" placeholder="パスワード">
            <div class="error">{{ errorMap['password'] }}</div>
            <button class="btn" @click="userInsert()">登録</button>
        </div>
    </div>
</template>
<script setup>
import { eroorView } from '@/utils';
import axios from 'axios';
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter()
const mail = ref('');
const password = ref('');

const errorMap = ref({
    'mail': '',
    'password': '',
})

function userInsert(){
    axios.post('/user/insert',
        {
            mail: mail.value,
            password: password.value
        }
    ).then(() => {
        console.log('success')
        router.push({path: '/member'})
    })
    .catch(error => {
        eroorView(error, errorMap.value)
    })
    
}
</script>
<style src="../../css/user/user.css" scoped></style>