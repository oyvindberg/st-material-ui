package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMediaClassesMod {
  
  @JSImport("@mui/material/CardMedia/cardMediaClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/CardMedia/cardMediaClasses", JSImport.Default)
  @js.native
  val default: CardMediaClasses = js.native
  
  @scala.inline
  def getCardMediaUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardMediaUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.media
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.img
  */
  trait CardMediaClassKey extends StObject
  
  @js.native
  trait CardMediaClasses extends StObject {
    
    /** Styles applied to the root element if `component="picture or img"`. */
    var img: String = js.native
    
    /** Styles applied to the root element if `component="video, audio, picture, iframe, or img"`. */
    var media: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object CardMediaClasses {
    
    @scala.inline
    def apply(img: String, media: String, root: String): CardMediaClasses = {
      val __obj = js.Dynamic.literal(img = img.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardMediaClasses]
    }
    
    @scala.inline
    implicit class CardMediaClassesMutableBuilder[Self <: CardMediaClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
