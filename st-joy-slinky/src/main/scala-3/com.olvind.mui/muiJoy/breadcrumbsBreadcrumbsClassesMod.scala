package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsBreadcrumbsClassesMod {
  
  @JSImport("@mui/joy/Breadcrumbs/breadcrumbsClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Breadcrumbs/breadcrumbsClasses", JSImport.Default)
  @js.native
  val default: BreadcrumbsClasses = js.native
  
  inline def getBreadcrumbsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBreadcrumbsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type BreadcrumbsClassKey = "root" | "ol" | "li" | "separator" | "sizeSm" | "sizeMd" | "sizeLg"
  
  trait BreadcrumbsClasses extends StObject {
    
    /** Styles applied to the li element. */
    var li: String
    
    /** Styles applied to the ol element. */
    var ol: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the separator element. */
    var separator: String
    
    /** Styles applied to the root element if `size="lg"`. */
    var sizeLg: String
    
    /** Styles applied to the root element if `size="md"`. */
    var sizeMd: String
    
    /** Styles applied to the root element if `size="sm"`. */
    var sizeSm: String
  }
  object BreadcrumbsClasses {
    
    inline def apply(
      li: String,
      ol: String,
      root: String,
      separator: String,
      sizeLg: String,
      sizeMd: String,
      sizeSm: String
    ): BreadcrumbsClasses = {
      val __obj = js.Dynamic.literal(li = li.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], sizeLg = sizeLg.asInstanceOf[js.Any], sizeMd = sizeMd.asInstanceOf[js.Any], sizeSm = sizeSm.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbsClasses] (val x: Self) extends AnyVal {
      
      inline def setLi(value: String): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      inline def setOl(value: String): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSizeLg(value: String): Self = StObject.set(x, "sizeLg", value.asInstanceOf[js.Any])
      
      inline def setSizeMd(value: String): Self = StObject.set(x, "sizeMd", value.asInstanceOf[js.Any])
      
      inline def setSizeSm(value: String): Self = StObject.set(x, "sizeSm", value.asInstanceOf[js.Any])
    }
  }
}
