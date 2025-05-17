<template>
    <div class="setting-main">
        <div class="bottom-border">
            <div>ユーザー</div>
        </div>
        <div class="bottom-border">
            <div @click="openUserEdit()">プロフィール編集</div>
            <div>パスワード変更</div>
        </div>
        <div @click="logOut">ログアウト</div>
    </div>
</template>
<script setup>
import { useRouter } from 'vue-router';
import { useStore } from 'vuex';

const store = useStore();
const router = useRouter();
const emit = defineEmits('openUserEdit');

function logOut() {
    store.dispatch('updateUserData', null);
    router.push({'path': '/login'});
}

function openUserEdit() {
    emit('openUserEdit');
}
</script>
<style src="../../css/main/setting.css" scoped></style>
