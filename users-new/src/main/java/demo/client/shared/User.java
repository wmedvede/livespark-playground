package demo.client.shared;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class User implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "USER_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "USER_ID_SEQ", name = "USER_ID_GENERATOR")
   @org.kie.api.definition.type.Label("ID #")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("Name")
   @org.hibernate.validator.constraints.NotEmpty
   private java.lang.String name;

   @org.kie.api.definition.type.Label("Last Name")
   @org.hibernate.validator.constraints.NotEmpty
   private java.lang.String lastName;

   @org.kie.api.definition.type.Label("Birthday")
   @javax.validation.constraints.NotNull
   private java.util.Date birthday;

   @org.kie.api.definition.type.Label("Married")
   private java.lang.Boolean married;

   @org.kie.api.definition.type.Label("Title")
   private java.lang.String title;

   @org.kie.api.definition.type.Label("Address")
   @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, cascade = {
         javax.persistence.CascadeType.ALL, javax.persistence.CascadeType.REMOVE }, optional = false)
   private demo.client.shared.Address address;

   @javax.persistence.OneToMany(fetch = javax.persistence.FetchType.EAGER, cascade = {
           javax.persistence.CascadeType.ALL, javax.persistence.CascadeType.REMOVE })
   @org.kie.api.definition.type.Label("Other Adresses")
   private java.util.List<demo.client.shared.Address> adresses;

   public User()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getLastName()
   {
      return this.lastName;
   }

   public void setLastName(java.lang.String lastName)
   {
      this.lastName = lastName;
   }

   public java.util.Date getBirthday()
   {
      return this.birthday;
   }

   public void setBirthday(java.util.Date birthday)
   {
      this.birthday = birthday;
   }

   public java.lang.Boolean getMarried()
   {
      return this.married;
   }

   public void setMarried(java.lang.Boolean married)
   {
      this.married = married;
   }

   public String getTitle()
   {
      return title;
   }

   public void setTitle(String title)
   {
      this.title = title;
   }

   public demo.client.shared.Address getAddress()
   {
      return this.address;
   }

   public void setAddress(demo.client.shared.Address address)
   {
      this.address = address;
   }

   public java.util.List<demo.client.shared.Address> getAdresses()
   {
      return this.adresses;
   }

   public void setAdresses(java.util.List<demo.client.shared.Address> adresses)
   {
      this.adresses = adresses;
   }

   public User(java.lang.Long id, java.lang.String name,
         java.lang.String lastName, java.util.Date birthday,
         java.lang.Boolean married, java.lang.String title,
         demo.client.shared.Address address,
         java.util.List<demo.client.shared.Address> adresses)
   {
      this.id = id;
      this.name = name;
      this.lastName = lastName;
      this.birthday = birthday;
      this.married = married;
      this.title = title;
      this.address = address;
      this.adresses = adresses;
   }

}
