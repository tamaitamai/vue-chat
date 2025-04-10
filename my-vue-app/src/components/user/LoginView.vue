<template>
    <div class="user-main">
        <div class="user-box">
            <div class="user-title">ログイン</div>
            <div class="user-parts">
                <label for="mail">メール：</label>
                <input type="text" id="mail" name="mail" v-model="mail">
            </div>
            <div class="user-parts">
                <label for="password">パスワード：</label>
                <input type="password" id="password" name="password" v-model="password">
            </div>
            <button class="btn" @click="userLogin()">ログイン</button>
        </div>
    </div>
</template>
<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter()
const mail = ref('')
const password = ref('')

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
    .catch(() => {
        alert('ログインができませんでした')
        console.log('ログインができませんでした')
    })
    
}
</script>
<style src="../../css/user/user.css" scoped></style>