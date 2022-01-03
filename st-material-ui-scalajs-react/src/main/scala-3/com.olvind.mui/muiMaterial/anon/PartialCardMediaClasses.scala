package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/CardMedia/cardMediaClasses.CardMediaClasses> */
trait PartialCardMediaClasses extends StObject {
  
  var img: js.UndefOr[String] = js.undefined
  
  var media: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialCardMediaClasses {
  
  inline def apply(): PartialCardMediaClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCardMediaClasses]
  }
  
  extension [Self <: PartialCardMediaClasses](x: Self) {
    
    inline def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
    
    inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
