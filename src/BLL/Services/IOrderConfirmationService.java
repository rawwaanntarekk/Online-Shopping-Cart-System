package BLL.Services;

import DAL.Models.User;

public interface IOrderConfirmationService {



    public void sendConfirmation(User user);
}
