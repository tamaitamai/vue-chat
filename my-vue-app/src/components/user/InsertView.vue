<template>
    <div class="user-main">
        <div class="user-box">
            <div class="user-title">新規登録</div>
            <div class="user-parts">
                <label for="name">ユーザー名：</label>
                <input type="text" id="name" name="name">
            </div>
            <div class="user-parts">
                <label for="password">パスワード：</label>
                <input type="text" id="password" name="password">
            </div>
            <button class="btn" @click="userLogin()">登録</button>
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
<style src="../../css/user/user.css" scoped></style>