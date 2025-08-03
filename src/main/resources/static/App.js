// src/App.js
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Dashboard from "./components/Dashboard/Dashboard";
import Ticket from "./components/Ticket/Ticket";
import Profile from "./components/Profile/Profile";
import BusStopsMap from "./components/BusStopsMap/BusStopsMap";
import Wallet from "./components/Wallet/Wallet";
import { AppBar, Toolbar, Button } from "@mui/material";

export default function App() {
  return (
    <Router>
      <AppBar position="static">
        <Toolbar>
          <Button color="inherit" component={Link} to="/">Dashboard</Button>
          <Button color="inherit" component={Link} to="/tickets">Tickets</Button>
          <Button color="inherit" component={Link} to="/profile">Profile</Button>
          <Button color="inherit" component={Link} to="/map">Bus Stops Map</Button>
          <Button color="inherit" component={Link} to="/wallet">Wallet</Button>
        </Toolbar>
      </AppBar>
      <Routes>
        <Route path="/" element={<Dashboard />} />
        <Route path="/tickets" element={<Ticket />} />
        <Route path="/profile" element={<Profile />} />
        <Route path="/map" element={<BusStopsMap />} />
        <Route path="/wallet" element={<Wallet />} />
      </Routes>
    </Router>
  );
}
