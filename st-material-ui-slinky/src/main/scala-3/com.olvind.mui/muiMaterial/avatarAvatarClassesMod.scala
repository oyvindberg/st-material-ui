package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarAvatarClassesMod {
  
  @JSImport("@mui/material/Avatar/avatarClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Avatar/avatarClasses", JSImport.Default)
  @js.native
  val default: AvatarClasses = js.native
  
  inline def getAvatarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvatarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AvatarClassKey = "root" | "colorDefault" | "circular" | "rounded" | "square" | "img" | "fallback"
  
  trait AvatarClasses extends StObject {
    
    /** Styles applied to the root element if `variant="circular"`. */
    var circular: String
    
    /** Styles applied to the root element if not `src` or `srcSet`. */
    var colorDefault: String
    
    /** Styles applied to the fallback icon */
    var fallback: String
    
    /** Styles applied to the img element if either `src` or `srcSet` is defined. */
    var img: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `variant="rounded"`. */
    var rounded: String
    
    /** Styles applied to the root element if `variant="square"`. */
    var square: String
  }
  object AvatarClasses {
    
    inline def apply(
      circular: String,
      colorDefault: String,
      fallback: String,
      img: String,
      root: String,
      rounded: String,
      square: String
    ): AvatarClasses = {
      val __obj = js.Dynamic.literal(circular = circular.asInstanceOf[js.Any], colorDefault = colorDefault.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], rounded = rounded.asInstanceOf[js.Any], square = square.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarClasses] (val x: Self) extends AnyVal {
      
      inline def setCircular(value: String): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setColorDefault(value: String): Self = StObject.set(x, "colorDefault", value.asInstanceOf[js.Any])
      
      inline def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setSquare(value: String): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    }
  }
}
