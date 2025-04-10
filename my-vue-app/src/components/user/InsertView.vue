<template>
    <div class="user-main">
        <div class="user-box">
            <div class="user-title">新規登録</div>
            <div class="user-parts">
                <label for="mail">ユーザー名：</label>
                <input type="text" id="mail" name="mail" v-model="mail">
            </div>
            <div class="user-parts">
                <label for="password">パスワード：</label>
                <input type="password" id="password" name="password" v-model="password">
            </div>
            <button class="btn" @click="userInsert()">登録</button>
        </div>
    </div>
</template>
<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter()
const mail = ref('');
const password = ref('');

function userInsert(){
    axios.post('/user/insert',
        {
            mail: mail.value,
            password: password.value
        }
    ).then(() => {
        console.log('success')
    })
    .catch(() => {
        console.log('新規会員登録できませんでした')
    })
    router.push({path: '/member'})
}
</script>
<style src="../../css/user/user.css" scoped></style>