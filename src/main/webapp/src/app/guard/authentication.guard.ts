import {Injectable} from '@angular/core';
import {ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot} from '@angular/router';
import {AuthenticationService} from "../service/authentication.service";
import {NotificationService} from "../utils/notification/notification.service";
import {NotificationTypeEnum} from "../model/enum/notification-type.enum";

@Injectable()
export class AuthenticationGuard implements CanActivate {

  constructor(private authenticationService: AuthenticationService,
              private router: Router,
              private notificationService: NotificationService) {
  }

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): boolean {
    return this.isUserLoggedIn();
  }

  private isUserLoggedIn(): boolean {
    if (this.authenticationService.isTokenValid()) {
      return true;
    }
    this.router.navigate(['/login']);
    this.notificationService.notify(NotificationTypeEnum.ERROR, 'You need to log in to access this page.');
    return false;
  }

}
