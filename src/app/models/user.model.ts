import { Child } from "./child.model";

export class User {
    id?: any;
    mail?: string;
    nom?: string;
    pass?: string;
    prenom?: string;
    childs?: Child[];
}
