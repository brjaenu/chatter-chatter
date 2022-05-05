import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import {RouterModule} from "@angular/router";
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {JwtInterceptor} from "./interceptor/jwt.interceptor";
import {AuthenticationGuard} from "./guard/authentication.guard";
import {NotificationModule} from "./utils/notification/notification.module";
import {LoginComponent} from './main/login/login.component';
import {RegisterComponent} from './main/register/register.component';
import {UserListComponent} from './main/user-management/user-list/user-list.component';
import {FontAwesomeModule} from "@fortawesome/angular-fontawesome";
import {FormsModule} from "@angular/forms";
import {LogoutComponent} from './main/logout/logout.component';
import {UserEditComponent} from './main/user-management/user-edit/user-edit.component';
import {NavigationComponent} from './utils/navigation/navigation.component';
import {ChatComponent} from './main/chat/chat.component';

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    LoginComponent,
    RegisterComponent,
    UserListComponent,
    LogoutComponent,
    UserEditComponent,
    NavigationComponent,
    ChatComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    NgbModule,
    NotificationModule,
    FontAwesomeModule,
    AppRoutingModule
  ],
  exports: [
    RouterModule
  ],
  providers: [
    AuthenticationGuard,
    {provide: HTTP_INTERCEPTORS, useClass: JwtInterceptor, multi: true}
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
