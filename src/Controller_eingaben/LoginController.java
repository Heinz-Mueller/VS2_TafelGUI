package Controller_eingaben;

import Model_daten.ModelDaten;

/**
 * Created by Fuse on 25.01.2017.
 */
public class LoginController
{
    public boolean setUser(String user)
    {
        try
        {
            ModelDaten model = new ModelDaten();
            return model.writeUser(user);
        } catch (Exception er) {
            return false;
        }
    }
}
