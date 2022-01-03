package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/CardMedia/cardMediaClasses.CardMediaClasses> */
@js.native
trait PartialCardMediaClasses extends StObject {
  
  var img: js.UndefOr[String] = js.native
  
  var media: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialCardMediaClasses {
  
  @scala.inline
  def apply(): PartialCardMediaClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCardMediaClasses]
  }
  
  @scala.inline
  implicit class PartialCardMediaClassesMutableBuilder[Self <: PartialCardMediaClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
