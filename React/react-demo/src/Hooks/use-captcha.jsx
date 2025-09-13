

export function useCaptcha() {
    
    let code = ``;
    code = `${Math.round(Math.random()*10)} ${Math.round(Math.random()*10)} ${Math.round(Math.random()*10)} ${Math.round(Math.random()*10)} ${Math.round(Math.random()*10)} ${Math.round(Math.random()*10)}`

    return code;
}