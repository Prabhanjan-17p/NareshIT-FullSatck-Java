import { useState } from "react"
import { CustomDataGrid } from "../../Controlled-Components/custom-render";

export function CustomeRenderingDemoTwo() {

    const [value, setValue] = useState('');

    function handleOnChangeSelect(e){
        if (e.target.value === 'Grid') {
            setValue('Grid')
        }else if (e.target.value === 'Card'){
            setValue('Card')
        }else{
            setValue('')
        }
    }

    return(
        <div className="container-fluid mt-4">
            <h3>Select Card / Table</h3>
            <select onChange={handleOnChangeSelect}>
                <option>Select One</option>
                <option value="Grid">Table</option>
                <option value="Card">Card</option>
            </select>

            <CustomDataGrid layout={value} them='table-dark' capation="Employee Details - Update on Dec 2024" fields={['First Name','Last Name','Designation']} data={[{FirstName:'Kanha',LastName:'Amanta', Designation:'Full Satck Devloper'},{FirstName:'Pravanjan',LastName:'Amanta', Designation:'Manger'} ]} footer="copyright 2024"  />
            
        </div>
    )
}