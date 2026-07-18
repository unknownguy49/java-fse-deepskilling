import "./App.css";
import officeImage from "./images/office.jpg";

function App() {

  const office={
    name:"DBS Business Center",
    rent:55000,
    address:"Bangalore"
  };

  const officeList=[
    {
      name:"DBS Business Center",
      rent:55000,
      address:"Bangalore"
    },
    {
      name:"WeWork",
      rent:75000,
      address:"Hyderabad"
    },
    {
      name:"Regus",
      rent:45000,
      address:"Chennai"
    },
    {
      name:"Awfis",
      rent:90000,
      address:"Mumbai"
    }
  ];

  return(
    <div className="App">

      <h1>Office Space Rental App</h1>

      <img
        src={officeImage}
        alt="Office Space"
        width="400"
        height="250"
      />

      <h2>Single Office Details</h2>

      <p><b>Name :</b> {office.name}</p>

      <p>
        <b>Rent :</b>
        <span
          style={{
            color:office.rent<60000?"red":"green"
          }}
        >
          {" "}{office.rent}
        </span>
      </p>

      <p><b>Address :</b> {office.address}</p>

      <hr/>

      <h2>Office Space List</h2>

      {
        officeList.map((item,index)=>(
          <div key={index} className="card">

            <p><b>Name :</b> {item.name}</p>

            <p>
              <b>Rent :</b>
              <span
                style={{
                  color:item.rent<60000?"red":"green"
                }}
              >
                {" "}{item.rent}
              </span>
            </p>

            <p><b>Address :</b> {item.address}</p>

            <hr/>

          </div>
        ))
      }

    </div>
  );

}

export default App;