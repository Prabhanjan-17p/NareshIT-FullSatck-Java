
export function DataBinding() {
    var username ="kanha"
    var defaultcity ="Angul"
    
    return(
        <div>
            <div><h1>Hello ! {username}</h1></div>
            <div>
                <h2>Select Your City</h2>
                <select value={defaultcity}>
                    <option value="-1">Select</option>
                    <option value="Bhubaneswar">Bhubaneswar</option>
                    <option value="Angul">Angul</option>
                    <option value="Cuttack">Cuttack</option>
                </select>
            </div>
        </div>
    )
}