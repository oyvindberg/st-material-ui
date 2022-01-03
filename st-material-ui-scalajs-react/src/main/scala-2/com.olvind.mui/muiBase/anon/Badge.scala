package com.olvind.mui.muiBase.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Badge extends StObject {
  
  var Badge: js.UndefOr[ElementType] = js.native
  
  var Root: js.UndefOr[ElementType] = js.native
}
object Badge {
  
  @scala.inline
  def apply(): Badge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Badge]
  }
  
  @scala.inline
  implicit class BadgeMutableBuilder[Self <: Badge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadge(value: ElementType): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "Badge", js.undefined)
    
    @scala.inline
    def setRoot(value: ElementType): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
  }
}
