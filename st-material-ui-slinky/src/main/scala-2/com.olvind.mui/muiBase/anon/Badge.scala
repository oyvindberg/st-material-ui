package com.olvind.mui.muiBase.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Badge extends StObject {
  
  var Badge: js.UndefOr[ReactElement] = js.native
  
  var Root: js.UndefOr[ReactElement] = js.native
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
    def setBadge(value: ReactElement): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "Badge", js.undefined)
    
    @scala.inline
    def setRoot(value: ReactElement): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
  }
}
