/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DashboardResponseDTO
 */


public class DashboardResponseDTO {
  @SerializedName("totalUsers")
  private Long totalUsers = null;

  @SerializedName("totalRoles")
  private Long totalRoles = null;

  @SerializedName("totalRights")
  private Long totalRights = null;

  @SerializedName("usersWithoutRoles")
  private Long usersWithoutRoles = null;

  @SerializedName("rolesWithoutRights")
  private Long rolesWithoutRights = null;

  @SerializedName("unusedRoles")
  private Long unusedRoles = null;

  @SerializedName("unusedRights")
  private Long unusedRights = null;

  public DashboardResponseDTO totalUsers(Long totalUsers) {
    this.totalUsers = totalUsers;
    return this;
  }

   /**
   * Get totalUsers
   * @return totalUsers
  **/
  @Schema(description = "")
  public Long getTotalUsers() {
    return totalUsers;
  }

  public void setTotalUsers(Long totalUsers) {
    this.totalUsers = totalUsers;
  }

  public DashboardResponseDTO totalRoles(Long totalRoles) {
    this.totalRoles = totalRoles;
    return this;
  }

   /**
   * Get totalRoles
   * @return totalRoles
  **/
  @Schema(description = "")
  public Long getTotalRoles() {
    return totalRoles;
  }

  public void setTotalRoles(Long totalRoles) {
    this.totalRoles = totalRoles;
  }

  public DashboardResponseDTO totalRights(Long totalRights) {
    this.totalRights = totalRights;
    return this;
  }

   /**
   * Get totalRights
   * @return totalRights
  **/
  @Schema(description = "")
  public Long getTotalRights() {
    return totalRights;
  }

  public void setTotalRights(Long totalRights) {
    this.totalRights = totalRights;
  }

  public DashboardResponseDTO usersWithoutRoles(Long usersWithoutRoles) {
    this.usersWithoutRoles = usersWithoutRoles;
    return this;
  }

   /**
   * Get usersWithoutRoles
   * @return usersWithoutRoles
  **/
  @Schema(description = "")
  public Long getUsersWithoutRoles() {
    return usersWithoutRoles;
  }

  public void setUsersWithoutRoles(Long usersWithoutRoles) {
    this.usersWithoutRoles = usersWithoutRoles;
  }

  public DashboardResponseDTO rolesWithoutRights(Long rolesWithoutRights) {
    this.rolesWithoutRights = rolesWithoutRights;
    return this;
  }

   /**
   * Get rolesWithoutRights
   * @return rolesWithoutRights
  **/
  @Schema(description = "")
  public Long getRolesWithoutRights() {
    return rolesWithoutRights;
  }

  public void setRolesWithoutRights(Long rolesWithoutRights) {
    this.rolesWithoutRights = rolesWithoutRights;
  }

  public DashboardResponseDTO unusedRoles(Long unusedRoles) {
    this.unusedRoles = unusedRoles;
    return this;
  }

   /**
   * Get unusedRoles
   * @return unusedRoles
  **/
  @Schema(description = "")
  public Long getUnusedRoles() {
    return unusedRoles;
  }

  public void setUnusedRoles(Long unusedRoles) {
    this.unusedRoles = unusedRoles;
  }

  public DashboardResponseDTO unusedRights(Long unusedRights) {
    this.unusedRights = unusedRights;
    return this;
  }

   /**
   * Get unusedRights
   * @return unusedRights
  **/
  @Schema(description = "")
  public Long getUnusedRights() {
    return unusedRights;
  }

  public void setUnusedRights(Long unusedRights) {
    this.unusedRights = unusedRights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardResponseDTO dashboardResponseDTO = (DashboardResponseDTO) o;
    return Objects.equals(this.totalUsers, dashboardResponseDTO.totalUsers) &&
        Objects.equals(this.totalRoles, dashboardResponseDTO.totalRoles) &&
        Objects.equals(this.totalRights, dashboardResponseDTO.totalRights) &&
        Objects.equals(this.usersWithoutRoles, dashboardResponseDTO.usersWithoutRoles) &&
        Objects.equals(this.rolesWithoutRights, dashboardResponseDTO.rolesWithoutRights) &&
        Objects.equals(this.unusedRoles, dashboardResponseDTO.unusedRoles) &&
        Objects.equals(this.unusedRights, dashboardResponseDTO.unusedRights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalUsers, totalRoles, totalRights, usersWithoutRoles, rolesWithoutRights, unusedRoles, unusedRights);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardResponseDTO {\n");
    
    sb.append("    totalUsers: ").append(toIndentedString(totalUsers)).append("\n");
    sb.append("    totalRoles: ").append(toIndentedString(totalRoles)).append("\n");
    sb.append("    totalRights: ").append(toIndentedString(totalRights)).append("\n");
    sb.append("    usersWithoutRoles: ").append(toIndentedString(usersWithoutRoles)).append("\n");
    sb.append("    rolesWithoutRights: ").append(toIndentedString(rolesWithoutRights)).append("\n");
    sb.append("    unusedRoles: ").append(toIndentedString(unusedRoles)).append("\n");
    sb.append("    unusedRights: ").append(toIndentedString(unusedRights)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}