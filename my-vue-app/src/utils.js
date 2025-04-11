// 入力時のエラー表示
export function eroorView(error, map) {
    if (error.response && error.response.status === 400) {
        const errors = error.response.data;
        for(const key in errors){
            map[key] = errors[key]
        }
        console.log('バリデーションエラー:', errors);
    }
}