package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListImageListClassesMod {
  
  @JSImport("@mui/material/ImageList/imageListClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ImageList/imageListClasses", JSImport.Default)
  @js.native
  val default: ImageListClasses = js.native
  
  inline def getImageListUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageListUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ImageListClassKey = "root" | "masonry" | "quilted" | "standard" | "woven"
  
  trait ImageListClasses extends StObject {
    
    /** Styles applied to the root element if `variant="masonry"`. */
    var masonry: String
    
    /** Styles applied to the root element if `variant="quilted"`. */
    var quilted: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `variant="standard"`. */
    var standard: String
    
    /** Styles applied to the root element if `variant="woven"`. */
    var woven: String
  }
  object ImageListClasses {
    
    inline def apply(masonry: String, quilted: String, root: String, standard: String, woven: String): ImageListClasses = {
      val __obj = js.Dynamic.literal(masonry = masonry.asInstanceOf[js.Any], quilted = quilted.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], woven = woven.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageListClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageListClasses] (val x: Self) extends AnyVal {
      
      inline def setMasonry(value: String): Self = StObject.set(x, "masonry", value.asInstanceOf[js.Any])
      
      inline def setQuilted(value: String): Self = StObject.set(x, "quilted", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
      
      inline def setWoven(value: String): Self = StObject.set(x, "woven", value.asInstanceOf[js.Any])
    }
  }
}
