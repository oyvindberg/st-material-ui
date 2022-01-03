package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseStrings.button
import com.olvind.mui.muiBase.muiBaseStrings.reset
import com.olvind.mui.muiBase.muiBaseStrings.submit
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ariacontrols extends StObject {
  
  var `aria-controls`: String | Null = js.native
  
  var `aria-selected`: Boolean = js.native
  
  var disabled: Boolean = js.native
  
  var id: String | Null = js.native
  
  def ref(): Unit = js.native
  def ref(instance: HTMLElement): Unit = js.native
  
  var role: String = js.native
  
  var tabIndex: Double = js.native
  
  var `type`: js.UndefOr[button | reset | submit] = js.native
}
