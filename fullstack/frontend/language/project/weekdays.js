function ran(){
    let h2= document.getElementById('num')
    let random=Math.floor(Math.random()*6+1)
    h2.innerHTML=random
    switch(random){
        case 1:h2.textContent="Monday";
        break;
        case 2:h2.textContent="Tuesday";
        break;
        case 3:h2.textContent="Wednesday";
        break;
        case 4:h2.textContent="Thursday";
        break;
        case 5:h2.textContent="Friday";
        break;
        case 6:h2.textContent="Saturday";
        break;
        case 7:h2.textContent="Sunday";
        break;
    }
}

