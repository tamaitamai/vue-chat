<template>
    <div class="user-main">
        <div class="user-box">
            <div class="user-title">ログイン</div>
            <div class="user-parts">
                <label for="name">ユーザー名：</label>
                <input type="text" id="name" name="name">
            </div>
            <div class="user-parts">
                <label for="password">パスワード：</label>
                <input type="text" id="password" name="password">
            </div>
            <button class="btn" @click="userLogin()">ログイン</button>
        </div>
    </div>
</template>
<script setup>
import { useRouter } from 'vue-router';

const router = useRouter()

function userLogin(){
    router.push({path: '/member'})
}
</script>
<style src="../../css/user/user.css"></style>
<style src="../../css/style.css"></style>