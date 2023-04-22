import React, { useEffect, useState } from "react";
import axios from "axios";
// import Header from '../Header';
// import Footer from '../Footer';
// import './Selel.css'
function SelectProfile() {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios
      .get("http://localhost:8080/user/selectAllProfile")
      .then((res) => setData(res.data));
  }, []);

  console.log(data);

  return (
    <div>
      <div className="c">
        {/* <Header/> */}
        <div className="s">
          <table border="4">
            <thead>
              <tr>
                <th>FirstName</th>
                <th>LastName</th>
                <th>DatreOfBirth</th>
                <th>Gennder</th>
                <th>Street</th>
                <th>Location</th>
                <th>City</th>
                <th>State</th>
                <th>Pincode</th>
                <th>MobileNo</th>
                <th>EmailId</th>
                <th>Password</th>
              </tr>
            </thead>
            <tbody>
              {data &&
                data.map((item) => (
                  <tr key={item.pvId}>
                    <td>{item.firstName}</td>
                    <td>{item.lastName}</td>
                    <td>{item.dateOfBirth}</td>
                    <td>{item.gennder}</td>
                    <td>{item.street}</td>
                    <td>{item.location}</td>
                    <td>{item.city}</td>
                    <td>{item.state}</td>
                    <td>{item.pincode}</td>
                    <td>{item.mobileno}</td>
                    <td>{item.emailID}</td>
                    <td>{item.password}</td>
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

export default SelectProfile;
