console.log(window)
// geolocation
window.navigator.geolocation.getCurrentPosition((pos) =>
{
      console.log(pos.coords.latitude,pos.coords.longitude,pos)
}, (err) =>
{
    console.log(err)
  })

//video and audio
function getVideoAndAudio ()
{
    window.navigator.mediaDevices.getUserMedia({ video: true, audio: true })
        .then((obj) =>
        {
        document.getElementById('vd').srcObject=obj
        })
       .catch(err=>console.log(err))
}
async function getVideoAndAudio2 ()
{
    try
    {
        const obj = await window.navigator.mediaDevices.getUserMedia({ video: true, audio: true });
    document.getElementById("vd").srcObject = obj;
    }
    catch (err)
    {
        console.log(err)
    }
}
document.getElementById('btn').addEventListener('click', getVideoAndAudio)

/* browsers can store multiple ways 
1. localStorage
2. sessionStorage
3. cookies
4. cache */
window.localStorage.setItem('count', 0);
console.log(window.localStorage.getItem("count"))

//clipboard