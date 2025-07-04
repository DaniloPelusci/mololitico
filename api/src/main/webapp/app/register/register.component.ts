import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './register.component.html'
})
export class RegisterComponent {
  user = { username: '', password: '' };

  constructor(private http: HttpClient) {}

  register() {
    this.http.post('/api/users', this.user).subscribe();
  }
}
