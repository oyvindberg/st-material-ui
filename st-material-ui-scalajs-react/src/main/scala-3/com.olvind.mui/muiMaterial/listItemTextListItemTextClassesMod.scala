package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemTextListItemTextClassesMod {
  
  @JSImport("@mui/material/ListItemText/listItemTextClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ListItemText/listItemTextClasses", JSImport.Default)
  @js.native
  val default: ListItemTextClasses = js.native
  
  inline def getListItemTextUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemTextUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ListItemTextClassKey = "root" | "multiline" | "dense" | "inset" | "primary" | "secondary"
  
  trait ListItemTextClasses extends StObject {
    
    /** Styles applied to the Typography component if dense. */
    var dense: String
    
    /** Styles applied to the root element if `inset={true}`. */
    var inset: String
    
    /** Styles applied to the Typography component if primary and secondary are set. */
    var multiline: String
    
    /** Styles applied to the primary `Typography` component. */
    var primary: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the secondary `Typography` component. */
    var secondary: String
  }
  object ListItemTextClasses {
    
    inline def apply(dense: String, inset: String, multiline: String, primary: String, root: String, secondary: String): ListItemTextClasses = {
      val __obj = js.Dynamic.literal(dense = dense.asInstanceOf[js.Any], inset = inset.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemTextClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemTextClasses] (val x: Self) extends AnyVal {
      
      inline def setDense(value: String): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setInset(value: String): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def setMultiline(value: String): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    }
  }
}
