<template>
    <div class="talk-container">
        <div class="left-main">
            <div class="select-title">トーク</div>
            <div class="talk-search bottom-border">
                <input type="text" class="input2 talk-input">
            </div>

            <div :class="talk-list">
                <div :class="['talk-box', true ? 'talk-odd': true]">
                    <div class="talk-left-box">
                        <img src="../../../public/image/dog.png" class="image">
                        <div class="talk-message">
                            <div class="talk-name">メンバー1</div>
                            <div class="talk-comment">コメント1</div>
                        </div>
                    </div>
                    <div class="talk-time">時間</div>
                </div>

                <div :class="['talk-box', false ? 'talk-odd': true]">
                    <div class="talk-left-box">
                        <img src="../../../public/image/cat.png" class="image">
                        <div class="talk-message">
                            <div class="talk-name">メンバー2</div>
                            <div class="talk-comment">コメント2</div>
                        </div>
                    </div>
                    <div class="talk-time">時間</div>
                </div>

                <div :class="['talk-box', true ? 'talk-odd': true]">
                    <div class="talk-left-box">
                        <img src="../../../public/image/dog.png" class="image">
                        <div class="talk-message">
                            <div class="talk-name">メンバー3</div>
                            <div class="talk-comment">コメント3</div>
                        </div>
                    </div>
                    <div class="talk-time">時間</div>
                </div>
            </div>
        </div> 
    </div>
    <TalkDetail></TalkDetail>
</template>
<script setup>
import TalkDetail from './TalkDetail.vue';


</script>
<style src="../../css/talk/talk.css" scoped></style>