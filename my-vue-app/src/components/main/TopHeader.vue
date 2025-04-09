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
            <div>ユーザー名</div>
            <div>設定</div>
        </div>
    </div>
</template>
<script setup>
import { ref } from 'vue';

const selectMap = ref({
    'home': false,
    'login': false,
    'insert': false,
    'member': false,
    'talk': false,
    'share': false,
})

function selectLink(select){
    for(const key in selectMap.value){
        if(key==select){
            selectMap.value[key] = true;
        }
        else{
            selectMap.value[key] = false;
        }
    }
}

</script>
<style src="../../css/main/top.css" scoped></style>
<style src="../../css/style.css" scoped></style>
