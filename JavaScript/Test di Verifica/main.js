fetch ('https://reqres.in/api/users')

.then(function(data){
    console.log("then 2:", data)

    for(i = 0; i< elemento.length; i++){
        let scheda= document.createElement('div')
        scheda.style.backgroundColor='white';
        scheda.style.width='200px';
        scheda.style.display='flex';
        scheda.style.flexDirection='column';
        scheda.style.alignItems='center';
        let name = document.createElement('h1')
        let email = document.createElement('p')
        let foto=document.createElement('a')
        let contatto=document.creat
        contatto.href='mailto;'+elemento[i].first_name +" "+elemento[i].last_name
        email.innerText=elemento[i].email
        foto.scr=elemento[i].avatar;


    }

    
    
    })
    .catch(function (error){
        console.log({error});
})

