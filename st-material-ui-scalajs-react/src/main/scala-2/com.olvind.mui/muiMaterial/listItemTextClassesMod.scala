package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemTextClassesMod {
  
  @JSImport("@mui/material/ListItemText/listItemTextClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ListItemText/listItemTextClasses", JSImport.Default)
  @js.native
  val default: ListItemTextClasses = js.native
  
  @scala.inline
  def getListItemTextUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemTextUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.multiline
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.dense
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inset
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.primary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.secondary
  */
  trait ListItemTextClassKey extends StObject
  
  @js.native
  trait ListItemTextClasses extends StObject {
    
    /** Styles applied to the Typography component if dense. */
    var dense: String = js.native
    
    /** Styles applied to the root element if `inset={true}`. */
    var inset: String = js.native
    
    /** Styles applied to the Typography component if primary and secondary are set. */
    var multiline: String = js.native
    
    /** Styles applied to the primary `Typography` component. */
    var primary: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the secondary `Typography` component. */
    var secondary: String = js.native
  }
  object ListItemTextClasses {
    
    @scala.inline
    def apply(dense: String, inset: String, multiline: String, primary: String, root: String, secondary: String): ListItemTextClasses = {
      val __obj = js.Dynamic.literal(dense = dense.asInstanceOf[js.Any], inset = inset.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemTextClasses]
    }
    
    @scala.inline
    implicit class ListItemTextClassesMutableBuilder[Self <: ListItemTextClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDense(value: String): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInset(value: String): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiline(value: String): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    }
  }
}
