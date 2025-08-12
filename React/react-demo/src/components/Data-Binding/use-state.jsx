import moment from "moment"
import { useEffect, useState } from "react"

export function UseS() {

    // const [cat , setCat] = useState(['All','Pant','Shirt'])

    // useEffect(()=>{

    // },[])

    // return(
    //     <div className="container-fluid">
    //         <h2>All Select</h2>
    //         <ul className="list-unstyled">
    //             {
    //                 cat.map((ca,index) => <li>{ca}</li>)
    //             }
    //         </ul>
    //     </div>
    // );



    //Object 

    /*
        const [pro,setPro] = useState({})
    
        useEffect(()=>{
            setPro({Name:'Realme TV',Price:65000.00})
        },[])
    
        return(
            <div className="container-fluid">
                <h2>Name</h2>
                <ul>
                    {
                        Object.keys(pro).map(key => <li key={key}>{key} : {pro[key]}</li>)
                    }
                </ul>
            </div>
        );
            */



    //Array of Object
    /*
    const[pro,setPro] = useState([{}])

    useEffect(()=>{
        setPro([{Name : 'TV',Price:95000.00},{Name : 'Mobile',Price:45000.00}])
    },[])

    return(
        <div className="container-fluid">
            <h2>Table</h2>
            <table className="table table-hover">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Price</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        pro.map(pro => <tr key={pro.Name}><td>{pro.Name}</td><td>{pro.Price}</td></tr>)
                    }
                </tbody>
            </table>

        </div>
    )
        */

    //Arraya-Object-Array

    // const [pro, setPro] = useState(
    //     [
    //         { Product_Type: 'Eloctronic', Product: ['TV', 'AC'] },
    //         { Product_Type: 'Footwear', Product: ['Sneakers', 'Boots', 'Casuals'] }
    //     ]
    // )

    // return (
    //     <div className="container-fluid">
    //         <h2>Menu</h2>
    //         <ol>
    //             {
    //                 pro.map(item => 
    //                 <li key={item}>{item.Product_Type}
    //                     <ul>
    //                         {item.Product.map(it => <li key={it}>{it}</li>)}
    //                     </ul>
    //                 </li>)
    //             }
    //         </ol>

    //         <h2>Select</h2>
    //         <select >
    //             {
    //                 pro.map(item => 
    //                     <optgroup label={item.Product_Type} key={item}>
    //                         {
    //                             item.Product.map(product => <option key={product}>{product}</option>)

    //                         }
    //                     </optgroup>
    //                 )
    //             }
    //         </select>
    //     </div>
    // )



    //Date Show using Moment
    // const[date] = useState(new Date())

    // return(
    //     <div className="container-fluid">
    //         {
    //             /* <h1>{date.toString()}</h1>  using clasic means javascript */
    //             <h1>{moment(date).format('DD dddd, MMMM YYYY')}</h1>
    //         }

    //     </div>
    // )



    //Two Ways Dinding 

    // const [user,setUser] = useState('')

    // useEffect(()=>{
    //     setUser('Kanha')
    // },[])

    // function ChengeUserName(e) {
    //     setUser(e.target.value);
    // }

    // function VerifyUserName(e) {
    //     if (e.target.value === "") {
    //         alert("Enter Your Name!!")
    //     }
    // }

    // return(
    //     <div className="container-fluid">
    //         <h2>Register</h2>
    //         <dl>
    //             <dt>User Name</dt>
    //             <dd><input type="text" onChange={ChengeUserName} onBlur={VerifyUserName} value={user}/></dd>
    //         </dl>
    //         <h3>Hello ! {user}</h3>
    //     </div>
    // );



    //Custom Arguments in React Events-5

    function handleClick(e,name,price,stock) {
        alert(`Name : ${name} \nPrice : ${price} \nStock : ${stock} \nX Position : ${e.clientX} \nButton ID : ${e.id}`)        
    }

    return(
        <div className="container-fluid">
            <button id="btnInsert" onClick={(e)=>handleClick(e,'TV',9800,true)}>Insert</button>
        </div>
    )

}