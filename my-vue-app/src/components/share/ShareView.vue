<template>
    <div class="share-main">
        <div class="select-title row-between-view">
            <div>共有</div>
            <input type="text" class="input1">
            <div class="row-right-position">すべて</div>
        </div>
        <div class="share-input-container">
            <div class="share-input-box column-between-view">
                <div>
                    <div class="select-title" style="background-color: white;">選択項目</div>
                </div>
                <textarea name="" id="" class="share-input-comment"></textarea>
                <div style="background-color: blue;">
                    <div class="select-title" style="background-color: white;">添付</div>
                    <div class="row-between-view select-title">
                        <div>画像を追加</div>
                        <div class="row-right-position">
                            <div class="row-view margin-right10">
                                <div>公開範囲：</div>
                                <div class="select-box" @click="viewSelectModal()">未選択<span class="select-arrow">▼</span></div>
                            </div>
                            <button class="btn2">投稿</button>
                        </div>
                    </div>
                </div>
            </div>
            <ShareList></ShareList>
        </div>
        <SelectModal v-show="selectModalFlg" @close-modal="closeSelectModal()"></SelectModal>
    </div>
</template>
<script setup>
import { ref } from 'vue';
import SelectModal from '../modal/SelectModal.vue';
import ShareList from './ShareList.vue';

const selectModalFlg = ref(false);

function viewSelectModal(){
    selectModalFlg.value = true;
}

function closeSelectModal(){
    selectModalFlg.value = false;
}

</script>
<style src="../../css/share/share.css" scoped></style>