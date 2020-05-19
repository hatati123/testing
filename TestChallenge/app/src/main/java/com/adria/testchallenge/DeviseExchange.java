package com.adria.testchallenge;

import java.util.ArrayList;
import java.util.List;

public class DeviseExchange {


private String base;
private String date;
private RatesEntity rates;

public List<Devise> getListDevise(){
       List<Devise> DeviseList = new ArrayList<>();
       DeviseList.add(new Devise("CAD",rates.getCAD()));
       DeviseList.add(new Devise("HKD",rates.getHKD()));
       DeviseList.add(new Devise("ISK",rates.getISK()));
       DeviseList.add(new Devise("PHP",rates.getPHP()));
       DeviseList.add(new Devise("DKK",rates.getDKK()));
       DeviseList.add(new Devise("HUF",rates.getHUF()));
       DeviseList.add(new Devise("CZK",rates.getCZK()));
       DeviseList.add(new Devise("AUD",rates.getAUD()));
       DeviseList.add(new Devise("RON",rates.getRON()));
       DeviseList.add(new Devise("SEK",rates.getSEK()));
       DeviseList.add(new Devise("IDR",rates.getIDR()));
       DeviseList.add(new Devise("INR",rates.getINR()));
       DeviseList.add(new Devise("BRL",rates.getBRL()));
       DeviseList.add(new Devise("RUB",rates.getRUB()));
       DeviseList.add(new Devise("HRK",rates.getHRK()));
       DeviseList.add(new Devise("JPY",rates.getJPY()));
       DeviseList.add(new Devise("THB",rates.getTHB()));
       DeviseList.add(new Devise("CHF",rates.getCHF()));
       DeviseList.add(new Devise("SGD",rates.getSGD()));
       DeviseList.add(new Devise("PLN",rates.getPLN()));
       DeviseList.add(new Devise("TRY",rates.getTRY()));
       DeviseList.add(new Devise("CNY",rates.getCNY()));
       DeviseList.add(new Devise("NOK",rates.getNOK()));
       DeviseList.add(new Devise("NZD",rates.getNZD()));
       DeviseList.add(new Devise("ZAR",rates.getZAR()));
       DeviseList.add(new Devise("USD",rates.getUSD()));
       DeviseList.add(new Devise("MXN",rates.getMXN()));
       DeviseList.add(new Devise("ILS",rates.getILS()));
       DeviseList.add(new Devise("GBP",rates.getGBP()));
       DeviseList.add(new Devise("KRW",rates.getKRW()));
       DeviseList.add(new Devise("MYR",rates.getMYR()));

   return DeviseList;
}

   public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public RatesEntity getRates() {
        return rates;
    }

    public void setRates(RatesEntity rates) {
        this.rates = rates;
    }

    public static class RatesEntity {
        private  double CAD;
        private  double HKD;
        private  double ISK;
        private  double PHP;
        private  double DKK;
        private  double HUF;
        private  double CZK;
        private  double AUD;
        private  double RON;
        private  double SEK;
        private  double IDR;
        private  double INR;
        private  double BRL;
        private  double RUB;
        private  double HRK;
        private  double JPY;
        private  double THB;
        private  double CHF;
        private  double SGD;
        private  double PLN;
        private  double TRY;
        private  double CNY;
        private  double NOK;
        private  double NZD;
        private  double ZAR;
        private  double USD;
        private  double MXN;
        private  double ILS;
        private  double GBP;
        private  double KRW;
        private  double MYR;


        public double getCAD() {
            return CAD;
        }

        public void setCAD(double CAD) {
            this.CAD = CAD;
        }

        public double getHKD() {
            return HKD;
        }

        public void setHKD(double HKD) {
            this.HKD = HKD;
        }

        public double getISK() {
            return ISK;
        }

        public void setISK(double ISK) {
            this.ISK = ISK;
        }

        public double getPHP() {
            return PHP;
        }

        public void setPHP(double PHP) {
            this.PHP = PHP;
        }

        public double getDKK() {
            return DKK;
        }

        public void setDKK(double DKK) {
            this.DKK = DKK;
        }

        public double getHUF() {
            return HUF;
        }

        public void setHUF(double HUF) {
            this.HUF = HUF;
        }

        public double getCZK() {
            return CZK;
        }

        public void setCZK(double CZK) {
            this.CZK = CZK;
        }

        public double getAUD() {
            return AUD;
        }

        public void setAUD(double AUD) {
            this.AUD = AUD;
        }

        public double getRON() {
            return RON;
        }

        public void setRON(double RON) {
            this.RON = RON;
        }

        public double getSEK() {
            return SEK;
        }

        public void setSEK(double SEK) {
            this.SEK = SEK;
        }

        public double getIDR() {
            return IDR;
        }

        public void setIDR(double IDR) {
            this.IDR = IDR;
        }

        public double getINR() {
            return INR;
        }

        public void setINR(double INR) {
            this.INR = INR;
        }

        public double getBRL() {
            return BRL;
        }

        public void setBRL(double BRL) {
            this.BRL = BRL;
        }

        public double getRUB() {
            return RUB;
        }

        public void setRUB(double RUB) {
            this.RUB = RUB;
        }

        public double getHRK() {
            return HRK;
        }

        public void setHRK(double HRK) {
            this.HRK = HRK;
        }

        public double getJPY() {
            return JPY;
        }

        public void setJPY(double JPY) {
            this.JPY = JPY;
        }

        public double getTHB() {
            return THB;
        }

        public void setTHB(double THB) {
            this.THB = THB;
        }

        public double getCHF() {
            return CHF;
        }

        public void setCHF(double CHF) {
            this.CHF = CHF;
        }

        public double getSGD() {
            return SGD;
        }

        public void setSGD(double SGD) {
            this.SGD = SGD;
        }

        public double getPLN() {
            return PLN;
        }

        public void setPLN(double PLN) {
            this.PLN = PLN;
        }

        public double getTRY() {
            return TRY;
        }

        public void setTRY(double TRY) {
            this.TRY = TRY;
        }

        public double getCNY() {
            return CNY;
        }

        public void setCNY(double CNY) {
            this.CNY = CNY;
        }

        public double getNOK() {
            return NOK;
        }

        public void setNOK(double NOK) {
            this.NOK = NOK;
        }

        public double getNZD() {
            return NZD;
        }

        public void setNZD(double NZD) {
            this.NZD = NZD;
        }

        public double getZAR() {
            return ZAR;
        }

        public void setZAR(double ZAR) {
            this.ZAR = ZAR;
        }

        public double getUSD() {
            return USD;
        }

        public void setUSD(double USD) {
            this.USD = USD;
        }

        public double getMXN() {
            return MXN;
        }

        public void setMXN(double MXN) {
            this.MXN = MXN;
        }

        public double getILS() {
            return ILS;
        }

        public void setILS(double ILS) {
            this.ILS = ILS;
        }

        public double getGBP() {
            return GBP;
        }

        public void setGBP(double GBP) {
            this.GBP = GBP;
        }

        public double getKRW() {
            return KRW;
        }

        public void setKRW(double KRW) {
            this.KRW = KRW;
        }

        public double getMYR() {
            return MYR;
        }

        public void setMYR(double MYR) {
            this.MYR = MYR;
        }
    }
}
