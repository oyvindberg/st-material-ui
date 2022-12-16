package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationPaginationClassesMod {
  
  @JSImport("@mui/material/Pagination/paginationClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Pagination/paginationClasses", JSImport.Default)
  @js.native
  val default: PaginationClasses = js.native
  
  inline def getPaginationUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type PaginationClassKey = "root" | "ul" | "outlined" | "text"
  
  trait PaginationClasses extends StObject {
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var outlined: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `variant="text"`. */
    var text: String
    
    /** Styles applied to the ul element. */
    var ul: String
  }
  object PaginationClasses {
    
    inline def apply(outlined: String, root: String, text: String, ul: String): PaginationClasses = {
      val __obj = js.Dynamic.literal(outlined = outlined.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationClasses] (val x: Self) extends AnyVal {
      
      inline def setOutlined(value: String): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUl(value: String): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
    }
  }
}
