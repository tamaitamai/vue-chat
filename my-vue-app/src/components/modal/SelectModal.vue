<template>
    <div class="modal-main">
        <div class="modal-box">
            <div class="select-title row-between-view">
                <div @click="closeModal()" class="btn-text">キャンセル</div>
                <div class="row-right-position btn-text">実行</div>
            </div>
            <div>セレクトモーダル表示</div>
        </div>
    </div>
</template>
<script setup>
const emit = defineEmits(['closeModal']);

function closeModal(){
    emit('closeModal');
}
</script>
<style src="../../css/modal/modal.css" scoped></style>
