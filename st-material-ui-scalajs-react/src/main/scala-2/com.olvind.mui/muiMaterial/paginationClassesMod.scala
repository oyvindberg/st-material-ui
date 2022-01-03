package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationClassesMod {
  
  @JSImport("@mui/material/Pagination/paginationClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Pagination/paginationClasses", JSImport.Default)
  @js.native
  val default: PaginationClasses = js.native
  
  @scala.inline
  def getPaginationUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.ul
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlined
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.text
  */
  trait PaginationClassKey extends StObject
  
  @js.native
  trait PaginationClasses extends StObject {
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var outlined: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `variant="text"`. */
    var text: String = js.native
    
    /** Styles applied to the ul element. */
    var ul: String = js.native
  }
  object PaginationClasses {
    
    @scala.inline
    def apply(outlined: String, root: String, text: String, ul: String): PaginationClasses = {
      val __obj = js.Dynamic.literal(outlined = outlined.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationClasses]
    }
    
    @scala.inline
    implicit class PaginationClassesMutableBuilder[Self <: PaginationClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutlined(value: String): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUl(value: String): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
    }
  }
}
