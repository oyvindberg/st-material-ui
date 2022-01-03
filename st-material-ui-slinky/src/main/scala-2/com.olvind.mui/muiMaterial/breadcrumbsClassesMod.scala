package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsClassesMod {
  
  @JSImport("@mui/material/Breadcrumbs/breadcrumbsClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Breadcrumbs/breadcrumbsClasses", JSImport.Default)
  @js.native
  val default: BreadcrumbsClasses = js.native
  
  @scala.inline
  def getBreadcrumbsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBreadcrumbsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.ol
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.li
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.separator
  */
  trait BreadcrumbsClassKey extends StObject
  
  @js.native
  trait BreadcrumbsClasses extends StObject {
    
    /** Styles applied to the li element. */
    var li: String = js.native
    
    /** Styles applied to the ol element. */
    var ol: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the separator element. */
    var separator: String = js.native
  }
  object BreadcrumbsClasses {
    
    @scala.inline
    def apply(li: String, ol: String, root: String, separator: String): BreadcrumbsClasses = {
      val __obj = js.Dynamic.literal(li = li.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsClasses]
    }
    
    @scala.inline
    implicit class BreadcrumbsClassesMutableBuilder[Self <: BreadcrumbsClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLi(value: String): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOl(value: String): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    }
  }
}
