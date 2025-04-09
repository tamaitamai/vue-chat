<template>
    <div class="left-main">
        <div class="top-select select-title">
            <div :class="['member-select', memberFlg ? 'select-on': true]" @click="clickMember()">メンバー</div>
            <div :class="['group-select', groupFlg ? 'select-on': true]" @click="clickGroup()">グループ</div>
        </div>
        <MemberList v-show="memberFlg"></MemberList>
        <GroupList v-show="groupFlg"></GroupList>
    </div>
</template>
<script setup>
import { ref } from 'vue';
import MemberList from './MemberList.vue';
import GroupList from './GroupList.vue';

const memberFlg = ref(true)
const groupFlg = ref(false)

function clickMember(){
    memberFlg.value = true;
    groupFlg.value = false;
}

function clickGroup(){
    memberFlg.value = false;
    groupFlg.value = true;
}
</script>
<style src="../../css/style.css"></style>
<style src="../../css/member/member.css"></style>