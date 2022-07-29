export class Parent{

    idParent?: number;
    firstName?: string;
    lastName?: string;
    mail?: string;
    cin?: string;
    adresse?: string;
    passe?: string;
    etatCivil?: string;
    phoneNb?: number;
    birthDate?: string;

  constructor(firstName: string,
    lastName: string,
    mail: string,
    cin: string,
    adresse: string,
    passe: string,
    etatCivil: string,
    phoneNb: number,
    birthDate: string,
    idParent?:number)
    {
        this.idParent=idParent;
        this.firstName=firstName;
        this.lastName=lastName;
        this.mail=mail;
        this.cin=cin;
        this.adresse=adresse;
        this.passe=passe;
        this.etatCivil=etatCivil;
        this.phoneNb=phoneNb;
        this.birthDate=birthDate;

  }


}