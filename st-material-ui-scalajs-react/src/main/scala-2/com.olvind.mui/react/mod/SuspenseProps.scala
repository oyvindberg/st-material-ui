package com.olvind.mui.react.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuspenseProps extends StObject {
  
  var children: js.UndefOr[Node] = js.native
  
  // TODO(react18): `fallback?: ReactNode;`
  /** A fallback react tree to show when a Suspense child (like React.lazy) suspends */
  var fallback: Element | String | Double | js.Object | js.Iterable[Node] | ReactPortal | Boolean | Null = js.native
  
  /**
    * The presence of this prop indicates that the content is computationally expensive to render.
    * In other words, the tree is CPU bound and not I/O bound (e.g. due to fetching data).
    * @see {@link https://github.com/facebook/react/pull/19936}
    */
  var unstable_expectedLoadTime: js.UndefOr[Double] = js.native
}
object SuspenseProps {
  
  @scala.inline
  def apply(): SuspenseProps = {
    val __obj = js.Dynamic.literal(fallback = null)
    __obj.asInstanceOf[SuspenseProps]
  }
  
  @scala.inline
  implicit class SuspensePropsMutableBuilder[Self <: SuspenseProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback(value: Element | String | Double | js.Object | js.Iterable[Node] | ReactPortal | Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackNull: Self = StObject.set(x, "fallback", null)
    
    @scala.inline
    def setFallbackVdomElement(value: VdomElement): Self = StObject.set(x, "fallback", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnstable_expectedLoadTime(value: Double): Self = StObject.set(x, "unstable_expectedLoadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnstable_expectedLoadTimeUndefined: Self = StObject.set(x, "unstable_expectedLoadTime", js.undefined)
  }
}
