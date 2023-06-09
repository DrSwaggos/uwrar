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
import io.swagger.client.model.RoleResponseDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * GenericListDTORoleResponseDTO
 */


public class GenericListDTORoleResponseDTO {
  @SerializedName("content")
  private List<RoleResponseDTO> content = null;

  public GenericListDTORoleResponseDTO content(List<RoleResponseDTO> content) {
    this.content = content;
    return this;
  }

  public GenericListDTORoleResponseDTO addContentItem(RoleResponseDTO contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<RoleResponseDTO>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(description = "")
  public List<RoleResponseDTO> getContent() {
    return content;
  }

  public void setContent(List<RoleResponseDTO> content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericListDTORoleResponseDTO genericListDTORoleResponseDTO = (GenericListDTORoleResponseDTO) o;
    return Objects.equals(this.content, genericListDTORoleResponseDTO.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericListDTORoleResponseDTO {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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