<template>
    <div class="modal-main">
        <div class="modal-box2">
            <div>ユーザー編集</div>
            <div class="error">{{ errorMap['mail'] }}</div>
            <input type="text" id="mail" name="mail" v-model="mail" placeholder="メール">
            <div class="error">{{ errorMap['lastName'] }}</div>
            <input type="text" id="lastName" name="lastName" v-model="lastName" placeholder="名字">
            <div class="error">{{ errorMap['firstName'] }}</div>
            <input type="text" id="firstName" name="firstName" v-model="firstName" placeholder="名前">
            <button @click="closeUserEdit()">閉じる</button>
            <button @click="editUser()">保存</button>
        </div>
    </div>
</template>
<script setup>
import { eroorView } from '@/utils';
import axios from 'axios';
import { computed, ref } from 'vue';
import { useStore } from 'vuex';

const emit = defineEmits('closeUserEdit');
const store = useStore();

const user = computed(() => store.getters.getUserData);
const mail = ref(user.value.mail);
const lastName = ref(user.value.lastName);
const firstName = ref(user.value.firstName);
const errorMap = ref({
    'mail': '',
    'lastName': '',
    'firstName': '',
});

function closeUserEdit() {
    emit('closeUserEdit');
}

function editUser() {
    console.log('edit');
    console.log(user.value.id);
    axios.post('/user/edit',
        {
            id: user.value.id,
            mail: mail.value,
            lastName: lastName.value,
            firstName: firstName.value
        }
    ).then(response => {
        store.dispatch('updateUserData', response.data);
        closeUserEdit();
    })
    .catch(error => {
        eroorView(error, errorMap.value)
    })
}
</script>
<style src="../../css/modal/modal.css" scoped></style>