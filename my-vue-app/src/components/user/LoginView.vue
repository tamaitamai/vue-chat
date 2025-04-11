<template>
    <div class="user-main">
        <div class="user-box">
            <div class="user-title">ログイン</div>
            <input type="text" id="mail" name="mail" v-model="mail" placeholder="メール">
            <div class="error">{{ errorMap['mail'] }}</div>
            <input type="password" id="password" name="password" v-model="password" placeholder="パスワード">
            <div class="error">{{ errorMap['password'] }}</div>
            <button class="btn" @click="userLogin()">ログイン</button>
        </div>
    </div>
</template>
<script setup>
import { eroorView } from '@/utils';
import axios from 'axios';
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter()
const mail = ref('')
const password = ref('')
const errorMap = ref({
    'mail': '',
    'password': '',
})

function userLogin(){
    axios.post('/user/login',
        {
            mail: mail.value,
            password: password.value
        }
    ).then(response => {
        console.log(response.data);
        if(response.data == ''){
            console.log('ユーザーデータを取得できませんでした')
        }
        else{
            router.push({path: '/member'})
        }
    })
    .catch(error => {
        eroorView(error, errorMap.value)
    })
    
}
</script>
<style src="../../css/user/user.css" scoped></style>