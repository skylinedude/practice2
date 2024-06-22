export const Flower=()=>{
    let car="Toyota Chaser"
    return(
<>
<h5>Favourite car name: {car}</h5>
<DriftCar/>
{DriftCar()}
<hr />
</>
    )
}
let DriftCar=()=>{
    return(
        <p>Toyota Chaser is used as drift car</p>
        )
          
}
    