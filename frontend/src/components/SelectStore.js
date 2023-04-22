import React, { useEffect, useState } from "react";
import axios from "axios";
// import Header from '../Header';
// import Footer from '../Footer';
// import './Selel.css'
function SelectStore() {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios
      .get("http://localhost:8080/admin/selectAllStore")
      .then((res) => setData(res.data));
  }, []);

  console.log(data);

  return (
    <div>
      <div className="c" style={{color:"white", display:"flex",justifyContent:"center", margin:"auto"}}>
        {/* <Header/> */}
        <div className="s">
          <table border="4" >
            <thead>
              <tr>
                <th>StoreID</th>
                <th>Name</th>
                <th>Street</th>
                <th>MobileNo</th>
                <th>City</th>
                <th>State</th>
                <th>Pincode</th>
              </tr>
            </thead>
            <tbody>
              {data &&
                data.map((item) => (
                  <tr key={item.storeId}>
                    <td>{item.storeID}</td>
                    <td>{item.name}</td>
                    <td>{item.street}</td>
                    <td>{item.mobile_no}</td>
                    <td>{item.city}</td>
                    <td>{item.state}</td>
                    <td>{item.pincode}</td>
                  </tr>
                ))}
            </tbody>
          </table>
        </div>
      </div>
      {/* <Footer/> */}
    </div>
  );
}

export default SelectStore;
