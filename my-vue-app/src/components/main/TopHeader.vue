<template>
    <div class="header-container">
        <div class="menu">
            <div class="top-title">VueChat</div>
            <RouterLink to="/" :class="['router-link', selectMap['home'] ? 'select-on': true]" 
            @click="selectLink('home')">ホーム</RouterLink>
            <RouterLink to="/login" class="router-link">ログイン</RouterLink>
            <RouterLink to="/insert" class="router-link">新規登録</RouterLink>
            <RouterLink to="/member" :class="['router-link', selectMap['member'] ? 'select-on': true]" 
            @click="selectLink('member')">メンバー</RouterLink>
            <RouterLink to="/talk" :class="['router-link', selectMap['talk'] ? 'select-on': true]" 
            @click="selectLink('talk')">トーク</RouterLink>
            <RouterLink to="/share" :class="['router-link', selectMap['share'] ? 'select-on': true]" 
            @click="selectLink('share')">共有</RouterLink>
        </div>
        <div class="operate">
            <div v-if="isShow">ユーザー名</div>
            <div v-else>
                <div>{{ user.lastName + user.firstName }}</div>
                <div @click="settingFlg = !settingFlg">設定</div>
                <SettingView v-if="settingFlg" @open-user-edit="openUserEdit()"></SettingView>
            </div>
        </div>
    </div>
    <EditUser v-if="userEditFlg" @close-user-edit="closeUserEdit()"></EditUser>
</template>
<script setup>
import { computed, ref } from 'vue';
import { useStore } from 'vuex';
import SettingView from './SettingView.vue';
import EditUser from '../user/EditUser.vue';

const store = useStore();

const selectMap = ref({
    'home': false,
    'login': false,
    'insert': false,
    'member': false,
    'talk': false,
    'share': false,
})
const user = computed(() => store.getters.getUserData);
const isShow = computed(() => user.value === null);
const settingFlg = ref(false);
const userEditFlg = ref(false);

function selectLink(select) {
    for(const key in selectMap.value){
        if(key==select){
            selectMap.value[key] = true;
        }
        else{
            selectMap.value[key] = false;
        }
    }
}

function openUserEdit() {
    userEditFlg.value = true;
}

function closeUserEdit() {
    userEditFlg.value = false;
}

</script>
<style src="../../css/main/top.css" scoped></style>
