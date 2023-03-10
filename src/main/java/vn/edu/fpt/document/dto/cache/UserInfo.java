package vn.edu.fpt.document.dto.cache;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Hoang Lam
 * @product : Charity Management System
 * @project : Charity System
 * @created : 21/11/2022 - 00:51
 * @contact : 0834481768 - hoang.harley.work@gmail.com
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonPropertyOrder({"username", "email", "fullName", "avatar", "roles"})
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 4689073615496931874L;
    private String username;
    private String email;
    private String fullName;
    private String avatar;
    private List<String> roles;
}
